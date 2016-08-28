import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String schedule_published_on;
	public String state;
	public String background_image;
	public int id;
	public String name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String location_name;
	public String code_of_conduct;
	public String description;
	public String topic;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public VersionModel _version;
	public String start_time;
	public String end_time;
	public String email;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String privacy;

	public RootModel(String organizer_name, String schedule_published_on, String state, String background_image, int id, String name, CreatorModel creator, Call_for_papersModel call_for_papers, String type, String location_name, String code_of_conduct, String description, String topic, String logo, ArrayList<Social_linksModel> social_links, String timezone, VersionModel version, String start_time, String end_time, String email, String organizer_description, CopyrightModel copyright, String privacy) {

		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.background_image = background_image;
		this.id = id;
		this.name = name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this._version = version;
		this.start_time = start_time;
		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.privacy = privacy;

	}

}