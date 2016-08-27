import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String description;
	public String start_time;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String state;
	public String logo;
	public CopyrightModel _copyright;
	public String location_name;
	public int id;
	public CreatorModel _creator;
	public String background_image;
	public String end_time;
	public String code_of_conduct;
	public String topic;
	public String schedule_published_on;
	public String name;
	public VersionModel _version;
	public String type;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;

	public RootModel(String organizer_description, String description, String start_time, String timezone, ArrayList<Social_linksModel> social_links, String email, String state, String logo, CopyrightModel copyright, String location_name, int id, CreatorModel creator, String background_image, String end_time, String code_of_conduct, String topic, String schedule_published_on, String name, VersionModel version, String type, String organizer_name, Call_for_papersModel call_for_papers, String privacy) {

		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this.timezone = timezone;
		this.social_links = social_links;
		this.email = email;
		this.state = state;
		this.logo = logo;
		this._copyright = copyright;
		this.location_name = location_name;
		this.id = id;
		this._creator = creator;
		this.background_image = background_image;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._version = version;
		this.type = type;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;

	}

}