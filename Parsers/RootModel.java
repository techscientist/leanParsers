import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String logo;
	public String start_time;
	public CopyrightModel _copyright;
	public String email;
	public String timezone;
	public String background_image;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String organizer_name;
	public String description;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_description;
	public String location_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;
	public String privacy;
	public String end_time;
	public String topic;

	public RootModel(String code_of_conduct, String logo, String start_time, CopyrightModel copyright, String email, String timezone, String background_image, String type, Call_for_papersModel call_for_papers, VersionModel version, String organizer_name, String description, String name, ArrayList<Social_linksModel> social_links, int id, String organizer_description, String location_name, String schedule_published_on, CreatorModel creator, String state, String privacy, String end_time, String topic) {

		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.start_time = start_time;
		this._copyright = copyright;
		this.email = email;
		this.timezone = timezone;
		this.background_image = background_image;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.organizer_name = organizer_name;
		this.description = description;
		this.name = name;
		this.social_links = social_links;
		this.id = id;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;
		this.privacy = privacy;
		this.end_time = end_time;
		this.topic = topic;

	}

}