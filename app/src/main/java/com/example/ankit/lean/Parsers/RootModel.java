import java.util.ArrayList;

class RootModel {

	public int id;
	public VersionModel _version;
	public String state;
	public String email;
	public CopyrightModel _copyright;
	public String logo;
	public String name;
	public String timezone;
	public String privacy;
	public String location_name;
	public String organizer_name;
	public String schedule_published_on;
	public String background_image;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String code_of_conduct;
	public String organizer_description;
	public String end_time;
	public CreatorModel _creator;
	public String type;
	public String topic;

	public RootModel(int id, VersionModel version, String state, String email, CopyrightModel copyright, String logo, String name, String timezone, String privacy, String location_name, String organizer_name, String schedule_published_on, String background_image, String description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String start_time, String code_of_conduct, String organizer_description, String end_time, CreatorModel creator, String type, String topic) {

		this.id = id;
		this._version = version;
		this.state = state;
		this.email = email;
		this._copyright = copyright;
		this.logo = logo;
		this.name = name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._creator = creator;
		this.type = type;
		this.topic = topic;

	}

}