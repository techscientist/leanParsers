import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public CopyrightModel _copyright;
	public String type;
	public CreatorModel _creator;
	public String timezone;
	public String privacy;
	public String location_name;
	public String description;
	public String organizer_name;
	public String email;
	public VersionModel _version;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public int id;
	public String start_time;
	public String organizer_description;
	public String code_of_conduct;
	public String logo;
	public String background_image;
	public String schedule_published_on;
	public String state;

	public RootModel(Call_for_papersModel call_for_papers, String end_time, CopyrightModel copyright, String type, CreatorModel creator, String timezone, String privacy, String location_name, String description, String organizer_name, String email, VersionModel version, String topic, ArrayList<Social_linksModel> social_links, String name, int id, String start_time, String organizer_description, String code_of_conduct, String logo, String background_image, String schedule_published_on, String state) {

		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this._copyright = copyright;
		this.type = type;
		this._creator = creator;
		this.timezone = timezone;
		this.privacy = privacy;
		this.location_name = location_name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.email = email;
		this._version = version;
		this.topic = topic;
		this.social_links = social_links;
		this.name = name;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.state = state;

	}

}