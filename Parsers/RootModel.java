import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String schedule_published_on;
	public String email;
	public String timezone;
	public String state;
	public String background_image;
	public VersionModel _version;
	public String name;
	public String type;
	public String logo;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_name;
	public String description;
	public String location_name;
	public int id;
	public String topic;
	public String privacy;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, String code_of_conduct, CopyrightModel copyright, String organizer_description, String schedule_published_on, String email, String timezone, String state, String background_image, VersionModel version, String name, String type, String logo, CreatorModel creator, ArrayList<Social_linksModel> social_links, String start_time, String organizer_name, String description, String location_name, int id, String topic, String privacy) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.timezone = timezone;
		this.state = state;
		this.background_image = background_image;
		this._version = version;
		this.name = name;
		this.type = type;
		this.logo = logo;
		this._creator = creator;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.description = description;
		this.location_name = location_name;
		this.id = id;
		this.topic = topic;
		this.privacy = privacy;

	}

}