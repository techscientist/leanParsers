import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String organizer_description;
	public String description;
	public String type;
	public String organizer_name;
	public String logo;
	public String location_name;
	public String background_image;
	public String state;
	public String code_of_conduct;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public CreatorModel _creator;
	public String start_time;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String name;
	public String timezone;
	public String end_time;
	public String topic;

	public RootModel(String privacy, String organizer_description, String description, String type, String organizer_name, String logo, String location_name, String background_image, String state, String code_of_conduct, VersionModel version, CopyrightModel copyright, Call_for_papersModel call_for_papers, int id, CreatorModel creator, String start_time, String schedule_published_on, ArrayList<Social_linksModel> social_links, String email, String name, String timezone, String end_time, String topic) {

		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.description = description;
		this.type = type;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.location_name = location_name;
		this.background_image = background_image;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._creator = creator;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.email = email;
		this.name = name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.topic = topic;

	}

}