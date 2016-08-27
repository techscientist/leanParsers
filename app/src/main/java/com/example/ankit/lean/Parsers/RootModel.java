import java.util.ArrayList;

class RootModel {

	public String description;
	public CreatorModel _creator;
	public String end_time;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String logo;
	public String start_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String timezone;
	public String name;
	public String organizer_description;
	public String background_image;
	public String topic;
	public String privacy;
	public VersionModel _version;
	public int id;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String state;

	public RootModel(String description, CreatorModel creator, String end_time, String location_name, ArrayList<Social_linksModel> social_links, String email, CopyrightModel copyright, String organizer_name, String logo, String start_time, String schedule_published_on, String code_of_conduct, String timezone, String name, String organizer_description, String background_image, String topic, String privacy, VersionModel version, int id, String type, Call_for_papersModel call_for_papers, String state) {

		this.description = description;
		this._creator = creator;
		this.end_time = end_time;
		this.location_name = location_name;
		this.social_links = social_links;
		this.email = email;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.name = name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.topic = topic;
		this.privacy = privacy;
		this._version = version;
		this.id = id;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.state = state;

	}

}